package player;

import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * @author Diego
 */
public final class Play {

    MediaPlayer media;
    double duration;

    /**
     * Ejecutar la aplicación para reproducir audio.
     */
    public Play() {
        JFXPanel panel = new JFXPanel();
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * @return Archivo a reproducir
     */
    public MediaPlayer getMedia() {
        return media;
    }

    /**
     * @param route ruta del archivo a reproducir
     */
    public void setMedia(String route) {
        this.media = new MediaPlayer(new Media(route));
        this.media.setOnReady(new Runnable() {
            @Override
            public void run() {
                duration = media.getMedia().getDuration().toSeconds();
            }
        });
    }

    /**
     * @param file archivo a reproducir en formato File
     */
    public void setMedia(File file) {
        this.media = new MediaPlayer(new Media(file.toURI().toString()));
        this.media.setOnReady(new Runnable() {
            @Override
            public void run() {
                duration = media.getMedia().getDuration().toSeconds();
            }
        });
        
    }

    /**
     * Reproducir
     */
    public void play() {
        this.media.play();
    }

    /**
     * Detener
     */
    public void stop() {
        this.media.stop();
    }

    /**
     * Pausar
     */
    public void pause() {
        this.media.pause();
    }
}
