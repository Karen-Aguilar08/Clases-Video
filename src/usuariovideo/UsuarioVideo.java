/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usuariovideo;

/**
 *
 * @author Admin
 */
public class UsuarioVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario usuario = new Usuario ("MACACO","macaco@gmail.com");
        Video video = new Video ("Monky Flyp",3600);
        usuario.verVideo(video);
        video.detener();
        Comentario comentario1 = new Comentario("MACACO", "Este es un comentario de prueba!");
        Comentario comentario2 = new Comentario("MONICA", "Esta genial el video!");
        System.out.println(comentario1);
        System.out.println(comentario2);
    }
    
}
