package Controllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorControllerTest {

    AdministradorController administradorController;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        administradorController = new AdministradorController("src/test/resources/minimercadoTest.csv");
    }

    @Test
    void produtoMaisVendidoTest() {
        assertEquals("Alimentacao", administradorController.produtoMaisVendido().getTipoProduto());
        assertEquals("Cerveja Super Bock", administradorController.produtoMaisVendido().getProduto());
    }

    @Test
    void adicionarUtilizadorValidoTest() throws IOException {
        String filePath = "src/test/resources/login_grandesNegociosTest.csv";

        administradorController.adicionarUtilizador("ADMIN", "tobias", "softdev", filePath);

        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        String tipoUtilizador = "";
        String username = "";
        String password = "";

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] linhaSeparada = linha.split(";");

            tipoUtilizador = linhaSeparada[0];
            username = linhaSeparada[1];
            password = linhaSeparada[2];
        }

        assertEquals("ADMIN", tipoUtilizador);
        assertEquals("tobias", username);
        assertEquals("softdev", password);

        // Falta o segundo caso
    }

    /**
     * Método para testar se o método adicionarUtilizador lança uma exceção caso o tipo de utilizador não seja admin ou func
     * @throws IOException
     */
    /*
    @Test
    public void adicionarUtilizadorInvalidoTest() throws IOException {
        String filePath = "src/test/resources/login_grandesNegociosTest.csv";

        assertThrows(IllegalArgumentException.class, () -> {
            administradorController.adicionarUtilizador("SEGURANCA", "zacarias", "12345", filePath);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            administradorController.adicionarUtilizador("ADMINISTRADOR", "jeremias", "12345", filePath);
        });
    }*/

    @AfterEach
    void tearDown() {
        // Limpar o ficheiro
        // Copiar do login_grandesNegociosTestOriginal.csv para login_grandesNegociosTest.csv
    }
}