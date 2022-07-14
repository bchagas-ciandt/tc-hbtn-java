import java.io.*;
import java.util.List;
@SuppressWarnings("unchecked")
public class SerializarEstudantes<T>{
    private final String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<T> estudantes) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {
            fout = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(estudantes);
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("Nao foi possivel serializar");
                }
            }
        }
    }

    public List<T> desserializar() {
        List<T> estudantes = null;
        FileInputStream fin = null;
        ObjectInputStream ois = null;
        try {
            fin = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fin);
            estudantes = (List<T>) ois.readObject();
            return estudantes;
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Nao foi possivel desserializar");
        } finally {
            if ( ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("Nao foi possivel desserializar");
                }
            }
        }
        return null;
    }
}

