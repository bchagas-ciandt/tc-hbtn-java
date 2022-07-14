import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<T>{
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<T> estudantes) {
        try {
            FileOutputStream fout = new FileOutputStream(nomeArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(estudantes);
            oos.close();

        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel serializar");
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<T> desserializar() {
        List<T> estudantes = new ArrayList<T>();
        try {
            FileInputStream fin = new FileInputStream(nomeArquivo);
            ObjectInputStream ois = new ObjectInputStream(fin);
            estudantes = (List<T>) ois.readObject();
            ois.close();
            return estudantes;
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        } catch (IOException e) {
            System.out.println("Nao foi possivel desserializar");
        } catch (ClassNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        }
        return null;
    }
}

