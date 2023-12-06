package Ex_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Logger {
    private String caminhoFicheiro;
    private static Logger instance;

    private Logger(String caminhoFicheiro) {
        this.caminhoFicheiro = caminhoFicheiro;
    }

    public static Logger getInstance(String caminhoFicheiro) {
        if (instance == null) {
            instance = new Logger(caminhoFicheiro);
        }

        return instance;
    }

    public void log(String mensagemLog) throws IOException {
        File ficheiroLog = new File(this.caminhoFicheiro);
        FileWriter fw = new FileWriter(ficheiroLog, true);

        LocalDateTime localDateTime = LocalDateTime.now();

        fw.append(localDateTime + ": " + mensagemLog + "\n");
        fw.close();
    }
}
