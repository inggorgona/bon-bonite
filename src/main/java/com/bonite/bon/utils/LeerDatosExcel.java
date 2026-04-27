package com.bonite.bon.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



public class LeerDatosExcel implements Closeable {

    private final XSSFWorkbook libro;

    public LeerDatosExcel() throws IOException {
        FileInputStream archivo = new FileInputStream(new File("datos.xlsx"));
        libro = new XSSFWorkbook(archivo);
    }

    public String leerDatos(String hoja, int valorFila, int valorColumna) {

        Sheet sheet = libro.getSheet(hoja);
        if (sheet == null) throw new IllegalArgumentException("La hoja " + hoja + " no existe.");

        Row row = sheet.getRow(valorFila);
        if (row == null) throw new IllegalArgumentException("La fila " + valorFila + " no existe.");

        Cell cell = row.getCell(valorColumna);
        if (cell == null) throw new IllegalArgumentException("La celda " + valorColumna + " no existe "+
                " valor de la hoja " + hoja +" fila "+valorFila);

        return cell.getStringCellValue();
    }

    // Método para obtener el número total de filas con datos en una hoja
    public int obtenerNumeroDeFilas(String hoja) {
        Sheet sheet = libro.getSheet(hoja);
        if (sheet == null) throw new IllegalArgumentException("La hoja " + hoja + " no existe.");
        return sheet.getPhysicalNumberOfRows();  // Devuelve el número de filas con datos
    }


    @Override
    public void close() throws IOException {
        if (libro != null) {
            libro.close();
        }
    }
}
