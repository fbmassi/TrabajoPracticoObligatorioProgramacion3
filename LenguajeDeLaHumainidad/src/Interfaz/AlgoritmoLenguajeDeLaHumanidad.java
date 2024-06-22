package Interfaz;

import java.util.List;

public interface AlgoritmoLenguajeDeLaHumanidad<T> {
    List<T> descubirPalabrasDeLaHumanidad(List<List<T>> letras, int rangoDesde, int rangoHasta);
}
