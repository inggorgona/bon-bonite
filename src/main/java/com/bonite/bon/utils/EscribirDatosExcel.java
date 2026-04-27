package com.bonite.bon.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirDatosExcel {

    private static final String RUTA_EXCEL = "Datos.xlsx";
    private final XSSFWorkbook libro;

    public EscribirDatosExcel() throws IOException {
        // Cargamos el archivo Excel desde la ruta especificada
        try (FileInputStream archivoEntrada = new FileInputStream(new File(RUTA_EXCEL))) {
            libro = new XSSFWorkbook(archivoEntrada);
        }
    }

    public void escribirDatos(String hoja, int valorFila, int valorColumna, String valor) throws IOException {
        // Obtenemos la hoja donde queremos escribir
        Sheet sheet = libro.getSheet(hoja);
        if (sheet == null) throw new IllegalArgumentException("La hoja " + hoja + " no existe.");

        // Obtenemos o creamos la fila
        Row row = sheet.getRow(valorFila);
        if (row == null) {
            row = sheet.createRow(valorFila);
        }

        // Obtenemos o creamos la celda
        Cell cell = row.getCell(valorColumna);
        if (cell == null) {
            cell = row.createCell(valorColumna);

        }

        // Escribimos el valor en la celda
        cell.setCellValue(valor);

        // Guardamos los cambios escribiendo de nuevo en el archivo
        try (FileOutputStream archivoSalida = new FileOutputStream(new File(RUTA_EXCEL))) {
            libro.write(archivoSalida);
        }
    }

    public void close() throws IOException {
        // Cerramos el libro de Excel al finalizar
        libro.close();
    }
}
