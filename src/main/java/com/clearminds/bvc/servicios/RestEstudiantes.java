package com.clearminds.bvc.servicios;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import com.clearminds.bvc.dtos.Estudiante;
import com.clearminds.bvc.excepciones.BDDException;
import com.clearminds.bvc.servicios.*;

@Path("/estudiantes")

public class RestEstudiantes {
	@Path("/insertar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	public void insertar(Estudiante estudiante){
		
		ServicioEstudiante serest = new ServicioEstudiante();
		try {
			serest.insertarEstudiante(estudiante);
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Path("/actualizar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
		public void actualizar(Estudiante estudiante){
			ServicioEstudiante serest = new ServicioEstudiante();
			try {
				serest.actualizarEstudiante(estudiante);
			} catch (BDDException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

	}
	
}
