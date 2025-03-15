import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistroPontosTest {

    @Test
    public void pontosCriarTopico(){
        Usuario u = new Usuario();

        u.nome = "Paulo";
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 5);
    }

    @Test
    public void pontosCriarTopicoVIP(){
        Usuario u = new Usuario();

        u.nome = "Paulo";
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 25);
    }

    @Test
    public void pontosCriarTopicoBonusDia(){
        Usuario u = new Usuario();

        u.nome = "Paulo";
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 3;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 15);
    }

    public void pontosCriarTopicoVIPBonusDia(){
        Usuario u = new Usuario();

        u.nome = "Paulo";
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 2;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 50);
    }
}