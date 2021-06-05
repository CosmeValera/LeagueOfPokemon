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

public class Files4Saving {

    public static GUI GUICallBack;

    public static void getFiles(List<String> filenames) throws Exception {

        File file = new File(Globals.globalFile);

        try ( FileInputStream fis = new FileInputStream(file);  Scanner in = new Scanner(fis)) {
            while (in.hasNextLine()) {
                String filename = in.nextLine();
                filenames.add(filename);
                System.out.println(filename);
            }
        } catch (IOException e) {
            //:D
        } catch (Exception e) {
            throw new Exception("Error in getFiles", e);
        }
    }

    public static void chargeData(String filename, GUI gui) throws Exception {
        GUICallBack = gui;
        File file = new File(filename);

        try ( FileInputStream fis = new FileInputStream(file);  DataInputStream ois = new DataInputStream(fis)) {

            Globals.starter.setGoldAmount(ois.readInt());
            Globals.starter.setDefeatedEnemies(ois.readInt());
            boolean teemoAvailable = ois.readBoolean();
            isTeemoAvailable(teemoAvailable);
            boolean poppyAvailable = ois.readBoolean();
            isPoppyAvailable(poppyAvailable);
            boolean gnarAvailable = ois.readBoolean();
            isGnarAvailable(gnarAvailable);
            boolean yuumiAvailable = ois.readBoolean();
            isYuumiAvailable(yuumiAvailable);

            if (Globals.starter.isTeemoAvailable()) {
                Globals.teemo.setHealth(ois.readDouble());
                Globals.teemo.setAttackDamage(ois.readInt());
                Globals.teemo.setPoisonDamage(ois.readInt());
                Globals.starter = Globals.teemo;
            }
            if (Globals.starter.isPoppyAvailable()) {
                Globals.poppy.setHealth(ois.readDouble());
                Globals.poppy.setAttackDamage(ois.readInt());
                Globals.poppy.setShieldProtection(ois.readInt());
                Globals.starter = Globals.poppy;
            }
            if (Globals.starter.isGnarAvailable()) {
                Globals.gnar.setHealth(ois.readDouble());
                Globals.gnar.setAttackDamage(ois.readInt());
                Globals.gnar.setResistance(ois.readInt());
                Globals.starter = Globals.gnar;
            }
            if (Globals.starter.isYuumiAvailable()) {
                Globals.yuumi.setHealth(ois.readDouble());
                Globals.yuumi.setAttackDamage(ois.readInt());
                Globals.yuumi.setHealing(ois.readInt());
                Globals.starter = Globals.yuumi;
            }

        } catch (Exception e) {
            System.out.println("Error en cargarDataDatos\n" + e.getMessage());
        }
    }

    private static void isYuumiAvailable(boolean yuumiAvailable) {
        Globals.starter.setYuumiAvailable(yuumiAvailable);
        Globals.teemo.setYuumiAvailable(yuumiAvailable);
        Globals.poppy.setYuumiAvailable(yuumiAvailable);
        Globals.gnar.setYuumiAvailable(yuumiAvailable);
        Globals.yuumi.setYuumiAvailable(yuumiAvailable);
    }

    private static void isGnarAvailable(boolean gnarAvailable) {
        Globals.starter.setGnarAvailable(gnarAvailable);
        Globals.teemo.setGnarAvailable(gnarAvailable);
        Globals.poppy.setGnarAvailable(gnarAvailable);
        Globals.gnar.setGnarAvailable(gnarAvailable);
        Globals.yuumi.setGnarAvailable(gnarAvailable);
    }

    private static void isPoppyAvailable(boolean poppyAvailable) {
        Globals.starter.setPoppyAvailable(poppyAvailable);
        Globals.teemo.setPoppyAvailable(poppyAvailable);
        Globals.poppy.setPoppyAvailable(poppyAvailable);
        Globals.gnar.setPoppyAvailable(poppyAvailable);
        Globals.yuumi.setPoppyAvailable(poppyAvailable);
    }

    private static void isTeemoAvailable(boolean teemoAvailable) {
        Globals.starter.setTeemoAvailable(teemoAvailable);
        Globals.teemo.setTeemoAvailable(teemoAvailable);
        Globals.poppy.setTeemoAvailable(teemoAvailable);
        Globals.gnar.setTeemoAvailable(teemoAvailable);
        Globals.yuumi.setTeemoAvailable(teemoAvailable);
    }

    public static void chargeData2(String filename, GUI gui) throws Exception {
        GUICallBack = gui;
        File file = new File(filename);

        try ( FileInputStream fis = new FileInputStream(file);  DataInputStream ois = new DataInputStream(fis)) {

            Globals.starter2.setGoldAmount(ois.readInt());
            Globals.starter2.setDefeatedEnemies(ois.readInt());
            Globals.starter2.setTeemoAvailable(ois.readBoolean());
            Globals.starter2.setPoppyAvailable(ois.readBoolean());
            Globals.starter2.setGnarAvailable(ois.readBoolean());
            Globals.starter2.setYuumiAvailable(ois.readBoolean());

            if (Globals.starter2.isTeemoAvailable()) {
                Globals.teemo2.setHealth(ois.readDouble());
                Globals.teemo2.setAttackDamage(ois.readInt());
                Globals.teemo2.setPoisonDamage(ois.readInt());
            }
            if (Globals.starter2.isPoppyAvailable()) {
                Globals.poppy2.setHealth(ois.readDouble());
                Globals.poppy2.setAttackDamage(ois.readInt());
                Globals.poppy2.setShieldProtection(ois.readInt());
            }
            if (Globals.starter2.isGnarAvailable()) {
                Globals.gnar2.setHealth(ois.readDouble());
                Globals.gnar2.setAttackDamage(ois.readInt());
                Globals.gnar2.setResistance(ois.readInt());
            }
            if (Globals.starter2.isYuumiAvailable()) {
                Globals.yuumi2.setHealth(ois.readDouble());
                Globals.yuumi2.setAttackDamage(ois.readInt());
                Globals.yuumi2.setHealing(ois.readInt());
            }

        } catch (Exception e) {
            System.out.println("Error in chargeData2\n" + e.getMessage());
        }
    }

    public static void saveData(String filename) throws Exception {
        removeFilename(filename); //Primero borramos si hay uno con mismo nombre

        File file = new File(filename);

        try ( FileOutputStream fos = new FileOutputStream(file);  DataOutputStream oos = new DataOutputStream(fos)) {
            oos.writeInt(Globals.starter.getGoldAmount());
            oos.writeInt(Globals.starter.getDefeatedEnemies());
            oos.writeBoolean(Globals.starter.isTeemoAvailable());
            oos.writeBoolean(Globals.starter.isPoppyAvailable());
            oos.writeBoolean(Globals.starter.isGnarAvailable());
            oos.writeBoolean(Globals.starter.isYuumiAvailable());

            if (Globals.starter.isTeemoAvailable()) {
                oos.writeDouble(Globals.teemo.getHealth());
                oos.writeInt((int)Globals.teemo.getAttackDamage());
                oos.writeInt(Globals.teemo.getPoisonDamage());
            }
            if (Globals.starter.isPoppyAvailable()) {
                oos.writeDouble(Globals.poppy.getHealth());
                oos.writeInt((int)Globals.poppy.getAttackDamage());
                oos.writeInt(Globals.poppy.getShieldProtection());
            }
            if (Globals.starter.isGnarAvailable()) {
                oos.writeDouble(Globals.gnar.getHealth());
                oos.writeInt((int)Globals.gnar.getAttackDamage());
                oos.writeInt(Globals.gnar.getResistance());
            }
            if (Globals.starter.isYuumiAvailable()) {
                oos.writeDouble(Globals.yuumi.getHealth());
                oos.writeInt((int)Globals.yuumi.getAttackDamage());
                oos.writeInt(Globals.yuumi.getHealing());
            }

            try {
                Files.write(Paths.get(Globals.globalFile), filename.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new Exception("Error in append data", e);
            }
        } catch (Exception e) {
            System.out.println("Error in saveData\n" + e.getMessage());
        }
    }

    public static void removeFilename(String filename) throws Exception {

        File file = new File(Globals.globalFile);
        File temp = File.createTempFile("file", ".txt", file.getParentFile());
        String charset = "UTF-8";
        String delete = filename;
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(temp), charset));
        try {
            for (String line; (line = reader.readLine()) != null;) {
                if (line.equals(Paths.get(filename).toString())) {
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
