package org.example;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SelectorDeRegalosTest {

    @Test
    @DisplayName("Test regalos")
    public void TestseleccionarRegalo() {
    assertEquals("Juguete de construcción", SelectorDeRegalos.seleccionarRegalo(101, 10));
    assertEquals("Libro de aventuras", SelectorDeRegalos.seleccionarRegalo(100,14));
    }
}