package com.mlifiuba.dondecurso.api;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class InformationClient {

	private static final String DEPTOS = "{ \"carreras\": [\r\n\t{\"codigo\": \"61\", \"nombre\": \"Matem\u00E1tica\"},\r\n\t{\"codigo\": \"62\", \"nombre\": \"F\u00EDsica\"},\r\n\t{\"codigo\": \"63\", \"nombre\": \"Qu\u00EDmica\"},\r\n\t{\"codigo\": \"64\", \"nombre\": \"Estabilidad\"},\r\n\t{\"codigo\": \"65\", \"nombre\": \"Electrotecnia\"},\r\n\t{\"codigo\": \"66\", \"nombre\": \"Elect\u00F3nica\"},\r\n\t{\"codigo\": \"67\", \"nombre\": \"Ingenier\u00EDa Mec\u00E1nica\"},\r\n\t{\"codigo\": \"68\", \"nombre\": \"Transporte\"},\r\n\t{\"codigo\": \"69\", \"nombre\": \"Hidr\u00E1ulica\"},\r\n\t{\"codigo\": \"70\", \"nombre\": \"Agrimensura\"},\r\n\t{\"codigo\": \"71\", \"nombre\": \"Gesti\u00F3n\"},\r\n\t{\"codigo\": \"72\", \"nombre\": \"Tecnolog\u00EDa Industrial\"},\r\n\t{\"codigo\": \"73\", \"nombre\": \"Ingenier\u00EDa Naval\"},\r\n\t{\"codigo\": \"74\", \"nombre\": \"Constucciones y Estructuras\"},\r\n\t{\"codigo\": \"75\", \"nombre\": \"Computaci\u00F3n\"},\r\n\t{\"codigo\": \"76\", \"nombre\": \"Ingenier\u00EDa Qu\u00EDmica\"},\r\n\t{\"codigo\": \"77\", \"nombre\": \"Seguridad del Trabajo y Ambiente\"},\r\n\t{\"codigo\": \"78\", \"nombre\": \"Idiomas\"},\r\n]}";
	private static final String MATERIAS = "{\"materias\": [\r\n\t{ \"codigo\": \"7501\", \"nombre\": \"COMPUTACION\"},\r\n\t{ \"codigo\": \"7502\", \"nombre\": \"ALGORITMOS Y PROGRAMACION I\"},\r\n\t{ \"codigo\": \"7504\", \"nombre\": \"ALGORITMOS Y PROGRAMACION II\"},\r\n\t{ \"codigo\": \"7506\", \"nombre\": \"ORGANIZACION DE DATOS\"},\r\n\t{ \"codigo\": \"7507\", \"nombre\": \"ALGORITMOS Y PROGRAMACION III\"},\r\n\t{ \"codigo\": \"7509\", \"nombre\": \"ANALISIS DE LA INFORMACION\"},\r\n\t{ \"codigo\": \"7510\", \"nombre\": \"TECNICAS DE DISE\uFFFDO\"},\r\n\t{ \"codigo\": \"7512\", \"nombre\": \"ANALISIS NUMERICO I\"},\r\n\t{ \"codigo\": \"7516\", \"nombre\": \"LENGUAJES DE PROGRAMACION\"},\r\n\t{ \"codigo\": \"7518\", \"nombre\": \"PROYECTOS INFORMATICOS\"},\r\n\t{ \"codigo\": \"7519\", \"nombre\": \"TEORIA DE COMUNICACION\"},\r\n\t{ \"codigo\": \"7523\", \"nombre\": \"INTELIGENCIA ARTIFICIAL\"},\r\n\t{ \"codigo\": \"7524\", \"nombre\": \"TEORIA DE LA PROGRAMACION\"},\r\n\t{ \"codigo\": \"7526\", \"nombre\": \"SIMULACION\"},\r\n\t{ \"codigo\": \"7527\", \"nombre\": \"ALGORITMOS Y PROGRAMACION IV\"},\r\n\t{ \"codigo\": \"7531\", \"nombre\": \"TEORIA DE LENGUAJE\"},\r\n\t{ \"codigo\": \"7539\", \"nombre\": \"APLICACIONES INFORMATICAS\"},\r\n\t{ \"codigo\": \"7540\", \"nombre\": \"ALGORITMOS Y PROGRAMACION I\"},\r\n\t{ \"codigo\": \"7541\", \"nombre\": \"ALGORITMOS Y PROGRAMACION II\"},\r\n\t{ \"codigo\": \"7542\", \"nombre\": \"TALLER DE PROGRAMACION I\"},\r\n\t{ \"codigo\": \"7544\", \"nombre\": \"ADM. Y CONTROL DE PROY. INFORMATICOS I\"},\r\n\t{ \"codigo\": \"7546\", \"nombre\": \"ADM. Y CONTROL DE PROY. INFORMATICOS II\"},\r\n\t{ \"codigo\": \"7547\", \"nombre\": \"TALLER DE DESARROLLO DE PROYECTOS II\"},\r\n\t{ \"codigo\": \"7548\", \"nombre\": \"CALIDAD EN DESARROLLO DE SISTEMAS\"},\r\n\t{ \"codigo\": \"7550\", \"nombre\": \"INTRODUCCION A LOS SISTEMAS INTELIGENTES\"},\r\n\t{ \"codigo\": \"7552\", \"nombre\": \"TALLER DE PROGRAMACION II\"},\r\n\t{ \"codigo\": \"7555\", \"nombre\": \"TALLER DE DESARROLLO DE PROYECTOS III\"},\r\n\t{ \"codigo\": \"7557\", \"nombre\": \"MODELOS DE PROCESOS DE DESARROLLO\"},\r\n\t{ \"codigo\": \"7558\", \"nombre\": \"EVALUACION DE PROY. Y MANEJO DE RIESGOS\"},\r\n\t{ \"codigo\": \"7559\", \"nombre\": \"TECNICAS DE PROGRAMACION CONCURRENTE I\"},\r\n\t{ \"codigo\": \"7563\", \"nombre\": \"SISTEMAS DISTRIBUIDOS II\"},\r\n\t{ \"codigo\": \"7566\", \"nombre\": \"MANUFACTURA INTEGRADA POR COMP.(CIM) II\"},\r\n\t{ \"codigo\": \"7568\", \"nombre\": \"SIST.DE SOPORTE P/CELDAS DE PROD FLEXIB.\"},\r\n\t{ \"codigo\": \"7569\", \"nombre\": \"SIST.AUTOM.DE DIAG.Y DETEC.DE FALLAS II\"},\r\n\t{ \"codigo\": \"7571\", \"nombre\": \"SEMINARIO DE ING. EN INFORMATICA I\"},\r\n\t{ \"codigo\": \"7573\", \"nombre\": \"ARQUITECTURA DEL SOFTWARE\"},\r\n\t{ \"codigo\": \"9501\", \"nombre\": \"COMPUTACI\uFFFDN\"},\r\n\t{ \"codigo\": \"9502\", \"nombre\": \"ALGORITMOS Y PROGRAMACI\uFFFDN III\"},\r\n\t{ \"codigo\": \"9504\", \"nombre\": \"AN\uFFFDLISIS NUM\uFFFDRICO I\"},\r\n\t{ \"codigo\": \"9511\", \"nombre\": \"ALGORITMOS Y PROGRAMACI\uFFFDN I\"},\r\n\t{ \"codigo\": \"9512\", \"nombre\": \"ALGORITMOS Y PROGRAMACI\uFFFDN II\"},\r\n\t{ \"codigo\": \"9513\", \"nombre\": \"M\uFFFDTODOS MATEM\uFFFDTICOS Y NUM\uFFFDRICOS\"},\r\n]}";
	private static final String CURSOS = "{\"cursos\": {\r\n\t\"1\": {\"docentes\": \"Guarna-Bianchi-Gonzalez Busqui\", \"vacantes\": \"100\", \"carreras\": \"Sistemas, Inform?tica\", \"horarios\" : [\r\n\t\t{\"dia\": \"Martes\", \"desde\": \"19:00\", \"hasta\": \"22:00\", \"aula\": \"PC-302\", \"tipo\": \"Te\uFFFDrico\"},\r\n\t\t{\"dia\": \"Jueves\", \"desde\": \"19:00\", \"hasta\": \"22:00\", \"aula\": \"PC-302\", \"tipo\": \"Te\uFFFDrico\"},\r\n\t]},\r\n\t\"2\": {\"docentes\": \"Azcurra-Bianchi-Salvia\", \"vacantes\": \"90\", \"carreras\": \"Sistemas, Inform?tica\", \"horarios\" : [\r\n\t\t{\"dia\": \"Mi\uFFFDrcoles\", \"desde\": \"19:00\", \"hasta\": \"22:00\", \"aula\": \"PC-E5\", \"tipo\": \"Te\uFFFDrico\"},\r\n\t\t{\"dia\": \"Lunes\", \"desde\": \"19:00\", \"hasta\": \"22:00\", \"aula\": \"PC-222\", \"tipo\": \"Te\uFFFDrico\"},\r\n\t]},\r\n\t\"3\": {\"docentes\": \"Garcia-Mendez\", \"vacantes\": \"40\", \"carreras\": \"Sistemas, Inform?tica\", \"horarios\" : [\r\n\t\t{\"dia\": \"Mi\uFFFDrcoles\", \"desde\": \"18:00\", \"hasta\": \"21:00\", \"aula\": \"PC-407\", \"tipo\": \"Te\uFFFDrico\"},\r\n\t\t{\"dia\": \"Martes\", \"desde\": \"18:00\", \"hasta\": \"21:00\", \"aula\": \"PC-LA\", \"tipo\": \"Te\uFFFDrico\"},\r\n\t]},\r\n\t\"4\": {\"docentes\": \"Garcia-Mendez-Mayor\", \"vacantes\": \"60\", \"carreras\": \"Sistemas, Inform?tica\", \"horarios\" : [\r\n\t\t{\"dia\": \"Mi\uFFFDrcoles\", \"desde\": \"15:00\", \"hasta\": \"18:00\", \"aula\": \"PC-414\", \"tipo\": \"Te\uFFFDrico\"},\r\n\t\t{\"dia\": \"Martes\", \"desde\": \"15:00\", \"hasta\": \"18:00\", \"aula\": \"PC-414\", \"tipo\": \"Te\uFFFDrico\"},\r\n\t]},\r\n\t\"5\": {\"docentes\": \"Wachenchauzer-Essaya\", \"vacantes\": \"10\", \"carreras\": \"Sistemas, Inform?tica\", \"horarios\" : [\r\n\t\t{\"dia\": \"Viernes\", \"desde\": \"16:00\", \"hasta\": \"17:30\", \"aula\": \"PC-201\", \"tipo\": \"Te\uFFFDrica Obligatoria\"},\r\n\t\t{\"dia\": \"Lunes\", \"desde\": \"16:00\", \"hasta\": \"17:30\", \"aula\": \"PC-201\", \"tipo\": \"Te\uFFFDrica Obligatoria\"},\r\n\t\t{\"dia\": \"Viernes\", \"desde\": \"17:30\", \"hasta\": \"19:00\", \"aula\": \"PC-LF\", \"tipo\": \"Te\uFFFDrico Pr\uFFFDctica Obligatoria\"},\r\n\t\t{\"dia\": \"Lunes\", \"desde\": \"17:30\", \"hasta\": \"19:00\", \"aula\": \"PC-LF\", \"tipo\": \"Te\uFFFDrico Pr\uFFFDctica Obligatoria\"},\r\n\t]},\r\n\t\"6\": {\"docentes\": \"Servetto-Calvo-Naon-Ferrer\", \"vacantes\": \"30\", \"carreras\": \"Sistemas, Inform?tica\", \"horarios\" : [\r\n\t\t{\"dia\": \"Mi\uFFFDrcoles\", \"desde\": \"16:00\", \"hasta\": \"19:00\", \"aula\": \"PC-A ASIG\", \"tipo\": \"Te\uFFFDrica\"},\r\n\t\t{\"dia\": \"Viernes\", \"desde\": \"16:00\", \"hasta\": \"19:00\", \"aula\": \"PC-A ASIG\", \"tipo\": \"Te\uFFFDrico\"},\r\n\t]},\r\n}}";

	public static List<InformationModel> getDeptos() {
		Gson gson = new Gson();
		DeptosResponse fromJson = gson.fromJson(DEPTOS, DeptosResponse.class);
		return fromJson.getCarreras();
	}

	public static List<InformationModel> getMaterias(String depto) {
		Gson gson = new Gson();
		MateriasResponse fromJson = gson.fromJson(MATERIAS, MateriasResponse.class);
		return fromJson.getMaterias();
	}

	public static List<Map<String,DetailsModel>> getCursos(String materia) {
		Gson gson = new Gson();
		Details fromJson = gson.fromJson(CURSOS, Details.class);
		return fromJson.getCursos();
	}

	private static class Details {
		private List<Map<String, DetailsModel>> cursos;

		public List<Map<String, DetailsModel>> getCursos() {
			return cursos;
		}

		public void setCursos(List<Map<String, DetailsModel>> cursos) {
			this.cursos = cursos;
		}
	}

	private static class MateriasResponse {

		private List<InformationModel> materias;

		public List<InformationModel> getMaterias() {
			return materias;
		}

		public void setMaterias(List<InformationModel> materias) {
			this.materias = materias;
		}
	}

	private static class DeptosResponse {

		private List<InformationModel> carreras;

		public List<InformationModel> getCarreras() {
			return carreras;
		}

		public void setCarreras(List<InformationModel> carreras) {
			this.carreras = carreras;
		}
	}
}
