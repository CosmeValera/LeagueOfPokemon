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
            boolean teemoDisponible = ois.readBoolean();
            isTeemoDisponible(teemoDisponible);
            boolean poppyDisponible = ois.readBoolean();
            isPoppyDisponible(poppyDisponible);
            boolean gnarDisponible = ois.readBoolean();
            isGnarDisponible(gnarDisponible);
            boolean yuumiDisponible = ois.readBoolean();
            isYuumiDisponible(yuumiDisponible);

            if (Global.starter.isTeemoDisponible()) {
                Global.teemo.setVida(ois.readDouble());
                Global.teemo.setDano(ois.readInt());
                Global.teemo.setDanoVeneno(ois.readInt());
                Global.starter = Global.teemo;
            }
            if (Global.starter.isPoppyDisponible()) {
                Global.poppy.setVida(ois.readDouble());
                Global.poppy.setDano(ois.readInt());
                Global.poppy.setProteccionEscudo(ois.readInt());
                Global.starter = Global.poppy;
            }
            if (Global.starter.isGnarDisponible()) {
                Global.gnar.setVida(ois.readDouble());
                Global.gnar.setDano(ois.readInt());
                Global.gnar.setResistencia(ois.readInt());
                Global.starter = Global.gnar;
            }
            if (Global.starter.isYuumiDisponible()) {
                Global.yuumi.setVida(ois.readDouble());
                Global.yuumi.setDano(ois.readInt());
                Global.yuumi.setCura(ois.readInt());
                Global.starter = Global.yuumi;
            }

        } catch (Exception e) {
            System.out.println("Error en cargarDataDatos\n" + e.getMessage());
        }
    }

    private static void isYuumiDisponible(boolean yuumiDisponible) {
        Global.starter.setYuumiDisponible(yuumiDisponible);
        Global.teemo.setYuumiDisponible(yuumiDisponible);
        Global.poppy.setYuumiDisponible(yuumiDisponible);
        Global.gnar.setYuumiDisponible(yuumiDisponible);
        Global.yuumi.setYuumiDisponible(yuumiDisponible);
    }

    private static void isGnarDisponible(boolean gnarDisponible) {
        Global.starter.setGnarDisponible(gnarDisponible);
        Global.teemo.setGnarDisponible(gnarDisponible);
        Global.poppy.setGnarDisponible(gnarDisponible);
        Global.gnar.setGnarDisponible(gnarDisponible);
        Global.yuumi.setGnarDisponible(gnarDisponible);
    }

    private static void isPoppyDisponible(boolean poppyDisponible) {
        Global.starter.setPoppyDisponible(poppyDisponible);
        Global.teemo.setPoppyDisponible(poppyDisponible);
        Global.poppy.setPoppyDisponible(poppyDisponible);
        Global.gnar.setPoppyDisponible(poppyDisponible);
        Global.yuumi.setPoppyDisponible(poppyDisponible);
    }

    private static void isTeemoDisponible(boolean teemoDisponible) {
        Global.starter.setTeemoDisponible(teemoDisponible);
        Global.teemo.setTeemoDisponible(teemoDisponible);
        Global.poppy.setTeemoDisponible(teemoDisponible);
        Global.gnar.setTeemoDisponible(teemoDisponible);
        Global.yuumi.setTeemoDisponible(teemoDisponible);
    }

    public static void cargarDataDatos2(String nombreFichero, GUI gui) throws Exception {
        GUICallBack = gui;
        File fichero = new File(nombreFichero);

        try ( FileInputStream fis = new FileInputStream(fichero);  DataInputStream ois = new DataInputStream(fis)) {

            Global.starter2.setCantidadOro(ois.readInt());
            Global.starter2.setEnemigosVencidos(ois.readInt());
            Global.starter2.setTeemoDisponible(ois.readBoolean());
            Global.starter2.setPoppyDisponible(ois.readBoolean());
            Global.starter2.setGnarDisponible(ois.readBoolean());
            Global.starter2.setYuumiDisponible(ois.readBoolean());

            if (Global.starter2.isTeemoDisponible()) {
                Global.teemo2.setVida(ois.readDouble());
                Global.teemo2.setDano(ois.readInt());
                Global.teemo2.setDanoVeneno(ois.readInt());
            }
            if (Global.starter2.isPoppyDisponible()) {
                Global.poppy2.setVida(ois.readDouble());
                Global.poppy2.setDano(ois.readInt());
                Global.poppy2.setProteccionEscudo(ois.readInt());
            }
            if (Global.starter2.isGnarDisponible()) {
                Global.gnar2.setVida(ois.readDouble());
                Global.gnar2.setDano(ois.readInt());
                Global.gnar2.setResistencia(ois.readInt());
            }
            if (Global.starter2.isYuumiDisponible()) {
                Global.yuumi2.setVida(ois.readDouble());
                Global.yuumi2.setDano(ois.readInt());
                Global.yuumi2.setCura(ois.readInt());
            }

        } catch (Exception e) {
            System.out.println("Error en cargarDataDatos2\n" + e.getMessage());
        }
    }

    public static void guardarDataDatos(String nombreFichero) throws Exception {
        borrarNombreFichero(nombreFichero); //Primero borramos si hay uno con mismo nombre

        File fichero = new File(nombreFichero);

        try ( FileOutputStream fos = new FileOutputStream(fichero);  DataOutputStream oos = new DataOutputStream(fos)) {
            oos.writeInt(Global.starter.getCantidadOro());
            oos.writeInt(Global.starter.getEnemigosVencidos());
            oos.writeBoolean(Global.starter.isTeemoDisponible());
            oos.writeBoolean(Global.starter.isPoppyDisponible());
            oos.writeBoolean(Global.starter.isGnarDisponible());
            oos.writeBoolean(Global.starter.isYuumiDisponible());

            if (Global.starter.isTeemoDisponible()) {
                oos.writeDouble(Global.teemo.getVida());
                oos.writeInt((int)Global.teemo.getDano());
                oos.writeInt(Global.teemo.getDanoVeneno());
            }
            if (Global.starter.isPoppyDisponible()) {
                oos.writeDouble(Global.poppy.getVida());
                oos.writeInt((int)Global.poppy.getDano());
                oos.writeInt(Global.poppy.getProteccionEscudo());
            }
            if (Global.starter.isGnarDisponible()) {
                oos.writeDouble(Global.gnar.getVida());
                oos.writeInt((int)Global.gnar.getDano());
                oos.writeInt(Global.gnar.getResistencia());
            }
            if (Global.starter.isYuumiDisponible()) {
                oos.writeDouble(Global.yuumi.getVida());
                oos.writeInt((int)Global.yuumi.getDano());
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
