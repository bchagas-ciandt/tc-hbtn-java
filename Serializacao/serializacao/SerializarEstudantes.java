import java.io.*;
import java.util.List;

public class SerializarEstudantes<T>{
    private final String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<T> estudantes) {
        try {
            FileOutputStream fout = new FileOutputStream(nomeArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(estudantes);
            oos.close();

        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<T> desserializar() {
        List<T> estudantes;
        try {
            FileInputStream fin = new FileInputStream(nomeArquivo);
            ObjectInputStream ois = new ObjectInputStream(fin);
            estudantes = (List<T>) ois.readObject();
            ois.close();
            return estudantes;
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Nao foi possivel desserializar");
        }
        return null;
    }
}

