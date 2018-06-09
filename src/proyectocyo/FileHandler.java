/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocyo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandler {
    
    private File file;
    private FileReader fr;
    private BufferedReader br;
    private FileReader frTamaCont;
    private BufferedReader brTamaCont;
    private String path;
    
    // Constructor
    public FileHandler(File file){
        this.file = file;
        try {
            this.fr = new FileReader(this.file);
            this.frTamaCont = new FileReader(this.file);
            this.br = new BufferedReader(this.fr);
            this.brTamaCont = new BufferedReader(this.frTamaCont);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Getters
    public File getFile() {
        return file;
    }

    public FileReader getFr() {
        return fr;
    }

    public BufferedReader getBr() {
        return br;
    }

    public FileReader getFrTamaCont() {
        return frTamaCont;
    }

    public BufferedReader getBrTamaCont() {
        return brTamaCont;
    }

    public String getPath() {
        return path;
    }

    // Setters
    public void setFile(File file) {
        this.file = file;
    }

    public void setFr(FileReader fr) {
        this.fr = fr;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public void setFrTamaCont(FileReader frTamaCont) {
        this.frTamaCont = frTamaCont;
    }

    public void setBrTamaCont(BufferedReader brTamaCont) {
        this.brTamaCont = brTamaCont;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
    
    
}
