package modelo;

import java.io.BufferedReader;
import java.util.List;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import vista.GUI;

public class Ficheros {

    public static GUI GUICallBack;

    public static void listadoPartidas(List<String> listadoNombreFicheros) throws Exception {

        File fichero = new File(Global.ficheroGlobal);

        try ( FileInputStream fis = new FileInputStream(fichero);  Scanner in = new Scanner(fis)) {
            while (in.hasNextLine()) {
                String ficheroNombre = in.nextLine();
                listadoNombreFicheros.add(ficheroNombre);
                System.out.println(ficheroNombre);
            }
        } catch (IOException e) {
            //:D
        } catch (Exception e) {
            throw new Exception("Error en listadoPartidas", e);
        }
    }

    public static void cargarDataDatos(String nombreFichero, GUI gui) throws Exception {
        GUICallBack = gui;
        File fichero = new File(nombreFichero);

        try ( FileInputStream fis = new FileInputStream(fichero);  DataInputStream ois = new DataInputStream(fis)) {

            Global.starter.setCantidadOro(ois.readInt());
            Global.starter.setEnemigosVencidos(ois.readInt());
            Starter.setTeemoDisponible(ois.readBoolean());
            Starter.setPoppyDisponible(ois.readBoolean());
            Starter.setGnarDisponible(ois.readBoolean());
            Starter.setYuumiDisponible(ois.readBoolean());

            if (Starter.isTeemoDisponible()) {
                Global.teemo.setVida(ois.readDouble());
                Global.teemo.setDano(ois.readInt());
                Global.teemo.setDanoVeneno(ois.readInt());
                Global.starter = Global.teemo;
            }
            if (Starter.isPoppyDisponible()) {
                Global.poppy.setVida(ois.readDouble());
                Global.poppy.setDano(ois.readInt());
                Global.poppy.setProteccionEscudo(ois.readInt());
                Global.starter = Global.poppy;
            }
            if (Starter.isGnarDisponible()) {
                Global.gnar.setVida(ois.readDouble());
                Global.gnar.setDano(ois.readInt());
                Global.gnar.setResistencia(ois.readInt());
                Global.starter = Global.gnar;
            }
            if (Starter.isYuumiDisponible()) {
                Global.yuumi.setVida(ois.readDouble());
                Global.yuumi.setDano(ois.readInt());
                Global.yuumi.setCura(ois.readInt());
                Global.starter = Global.yuumi;
            }

        } catch (Exception e) {
            System.out.println("Error en cargarDataDatos\n" + e.getMessage());
        }
    }

    public static void guardarDataDatos(String nombreFichero) throws Exception {
        borrarNombreFichero(nombreFichero); //Primero borramos si hay uno con mismo nombre

        File fichero = new File(nombreFichero);

        try ( FileOutputStream fos = new FileOutputStream(fichero);  DataOutputStream oos = new DataOutputStream(fos)) {
            oos.writeInt(Global.starter.getCantidadOro());
            oos.writeInt(Global.starter.getEnemigosVencidos());
            oos.writeBoolean(Starter.isTeemoDisponible());
            oos.writeBoolean(Starter.isPoppyDisponible());
            oos.writeBoolean(Starter.isGnarDisponible());
            oos.writeBoolean(Starter.isYuumiDisponible());

            if (Starter.isTeemoDisponible()) {
                oos.writeDouble(Global.teemo.getVida());
                oos.writeInt(Global.teemo.getDano());
                oos.writeInt(Global.teemo.getDanoVeneno());
            }
            if (Starter.isPoppyDisponible()) {
                oos.writeDouble(Global.poppy.getVida());
                oos.writeInt(Global.poppy.getDano());
                oos.writeInt(Global.poppy.getProteccionEscudo());
            }
            if (Starter.isGnarDisponible()) {
                oos.writeDouble(Global.gnar.getVida());
                oos.writeInt(Global.gnar.getDano());
                oos.writeInt(Global.gnar.getResistencia());
            }
            if (Starter.isYuumiDisponible()) {
                oos.writeDouble(Global.yuumi.getVida());
                oos.writeInt(Global.yuumi.getDano());
                oos.writeInt(Global.yuumi.getCura());
            }

            try {
                Files.write(Paths.get(Global.ficheroGlobal), nombreFichero.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new Exception("Error en append info");
            }
        } catch (Exception e) {
            System.out.println("Error en guardarDataDatos\n" + e.getMessage());
        }
    }

    public static void borrarNombreFichero(String nombreFichero) throws Exception {

        File file = new File(Global.ficheroGlobal);
        File temp = File.createTempFile("file", ".txt", file.getParentFile());
        String charset = "UTF-8";
        String delete = nombreFichero;
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(temp), charset));
        try {
            for (String line; (line = reader.readLine()) != null;) {
                if (line.equals(Paths.get(nombreFichero).toString())) {
                    File fileABorrar = new File(line);
                    Files.deleteIfExists(fileABorrar.toPath()); 
                }
                line = (line.contains(delete) ? null : line);
                writer.print((line != null) ? line + "\n" : "");
            }
        } catch (Exception e) {
            throw new Exception("Error en borrarNombreFichero", e);
        } finally {
            reader.close();
            writer.close();
            file.delete();
            temp.renameTo(file);
        }
    }
}
