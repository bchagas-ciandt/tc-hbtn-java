import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    public List<CanalNotificacao> canais;

    public ProcessadorVideo() {
        canais = new ArrayList<CanalNotificacao>();
    }
    
    public void registrarCanal(CanalNotificacao objeto) {
        if (objeto != null) {
            canais.add(objeto);
        }
    }
    
    public void processar(Video video) {
        for (CanalNotificacao canai : canais) {
            canai.notificar(new Mensagem(video.toString(), TipoMensagem.LOG));
        }
    }

}
