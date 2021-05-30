package modelo;

import java.util.List;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import vista.GUI;

public class Ficheros {

    public static GUI GUICallBack;

    public static void listadoPartidas(List<String> listadoNombreFicheros) throws Exception {

        try ( FileInputStream fis = new FileInputStream("todosLosFicheros.txt");  DataInputStream ois = new DataInputStream(fis)) {
            while (true) {
                listadoNombreFicheros.add(ois.readUTF());
            }
        } catch (IOException e) {
            //:D
        } catch (Exception e) {
            throw new Exception("Error en listadoPartidas", e);
        }
    }

    public static void cargarDataDatos(String nombreFichero, GUI gui) throws Exception {
        GUICallBack = gui;
        File fichero = new File("partida_" + nombreFichero + ".txt");

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

            if (Global.starter.getEnemigosVencidos() >= Starter.getVictoriesForFirstPrize()) {
                GUICallBack.getJMenuBar().getMenu(1).getItem(2).setVisible(true); //Visible panelCambiar
                GUICallBack.getJMenuBar().getMenu(0).getItem(3).setVisible(true); //Visible Gyarados
                if (Global.starter.getEnemigosVencidos() >= Starter.getVictoriesForSecondPrize()) {
                    GUICallBack.getJMenuBar().getMenu(0).getItem(4).setVisible(true); //Visible RayQuaza
                    if (Global.starter.getEnemigosVencidos() >= Starter.getVictoriesForThirdPrize()) {
                        GUICallBack.getJMenuBar().getMenu(0).getItem(5).setVisible(true); //Visible Arceus
                    }
                }
                GUICallBack.getJMenuBar().getMenu(1).getItem(2).doClick(); //Mostrar panel si hay + de 1 starter
            }

        } catch (Exception e) {
            System.out.println("Error en guardarObjectDatos\n" + e.getMessage());
        }
    }

    public static void guardarDataDatos(String nombreFichero) throws Exception {
        File fichero = new File("partida_" + nombreFichero + ".txt");

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

            File fichero2 = new File("todosLosFicheros.txt");
            try ( RandomAccessFile raf = new RandomAccessFile(fichero2, "rw")) {
                raf.seek(raf.length());
                raf.writeUTF("partida_" + nombreFichero + ".txt");
            } catch (IOException e) {
                throw new Exception("Error en raf cargarDaraDatos", e);
            }

        } catch (Exception e) {
            System.out.println("Error en guardarObjectDatos\n" + e.getMessage());
        }
    }

}
