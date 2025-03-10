import br.com.devflix.gui.botoes.BotaoPause;
import br.com.devflix.gui.botoes.BotaoPlay;
import br.com.devflix.gui.botoes.BotaoVoltar;
import br.com.devflix.Janela;
import br.com.devflix.MiniaturaVideo;
import br.com.devflix.videos.Anime;
import br.com.devflix.videos.Filme;
import br.com.devflix.videos.Novela;
import br.com.devflix.videos.Series;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        Anime anime = new Anime();
        Series series = new Series();
        Novela novela = new Novela();

        Janela janela = new Janela();
        MiniaturaVideo video = new MiniaturaVideo();

        BotaoPlay play = new BotaoPlay();
        BotaoPause pause = new BotaoPause();
        BotaoVoltar voltar = new BotaoVoltar();
    }
}