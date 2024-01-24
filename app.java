import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class app {
    public static void main(String[] args) throws Exception {
    String personagem = JOptionPane.showInputDialog(null, "Digite um personagem do anime Dragon Ball");
        String nomeImagem = "";
        String origem = "";

        switch (personagem) {
            case "Goku":
                origem = "Planeta Saiajin";
                nomeImagem = "goku-icone";
                break;
            case "Piccolo":
                origem = "Planeta Namekusei";
                nomeImagem = "piccolo-icone";
                break;
            case "Vegeta":
                origem = "Planeta Saiajin";
                nomeImagem = "vegeta-icone";
                break;
            case "Bulma":
                origem = "Planeta Terra";
                nomeImagem = "bulma-icone";
                break;
            case "Kuririn":
                origem = "Planeta Terra";
                nomeImagem = "kuririn-icone.jpg";
                break;
            default:
            origem = "Ainda Não Adicionada";
            nomeImagem = "default-icone";
                break;
        }
        
        //C:\Users\Kelvin Rosendo\Minhas Coisas- Programação\Projetos Java\Projeto  SwithCase\imagens\bulma-icone.jpg

        String caminhoImagem = String.format("C:/Users/Kelvin Rosendo/Minhas Coisas- Programação/Projetos Java/Projeto  SwithCase/imagens/%s.jpg", nomeImagem);
        ImageIcon icone = new ImageIcon(caminhoImagem);

        
        String informaçõesPersonagens = String.format("Personagem: %s\nOrigem: %s", personagem, origem);
        JOptionPane.showConfirmDialog(null, informaçõesPersonagens, "Descrição", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icone);
        
    }
}