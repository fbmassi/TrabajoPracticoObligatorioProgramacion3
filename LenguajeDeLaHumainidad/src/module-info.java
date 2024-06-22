module LenguajeDeLaHumainidad {
	requires ProyectoTPO1C.ViernesVirtual;
	requires org.opentest4j;
	requires org.junit.jupiter.api;
	requires org.junit.jupiter.engine;
	opens Implementaciones to org.junit.platform.commons;
}
