package net.tecgurus.spring.boot.ctrls;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.tecgurus.spring.boot.dto.PeticionConsulta;
import net.tecgurus.spring.boot.dto.PeticionCrearBanco;
import net.tecgurus.spring.boot.dto.ResponseConsultaBanco;
import net.tecgurus.spring.boot.dto.RespuestaConsulta;
import net.tecgurus.spring.boot.model.Banco;
import net.tecgurus.spring.boot.model.Cuenta;
import net.tecgurus.spring.boot.model.TipoMovimiento;
import net.tecgurus.spring.boot.repository.BancoCustomRepository;
import net.tecgurus.spring.boot.repository.BancoRepository;
import net.tecgurus.spring.boot.repository.CuentaRepository;
import net.tecgurus.spring.boot.repository.TipoMovimientoRepository;

@RestController
public class OperacionesControl {


	@Autowired
	private BancoRepository bancoRepository;
	
	@Autowired
	private BancoCustomRepository bancoCustomRepository;
	
	@Autowired
	private CuentaRepository cuentaRepository;
	
	@Autowired
	private TipoMovimientoRepository TipoMovimientoRepository;
	
	private HttpServletRequest request;

    @Autowired
    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    private String getClientIp() {

        String remoteAddr = "";

        if (request != null) {
            remoteAddr = request.getHeader("X-FORWARDED-FOR");
            if (remoteAddr == null || "".equals(remoteAddr)) {
                remoteAddr = request.getRemoteAddr();
            }
        }

        return remoteAddr;
    }
    
	/*
	 * CRUD Banco
	 * 
	 */
	
	@RequestMapping(value = "/banco/buscar/nombre", method = RequestMethod.GET)
	public @ResponseBody List<Banco> buscarXnombreBanco(@RequestParam("nombre") String nombre) {
		
		System.out.println("IP "+getClientIp());
		
		List<Banco> lista = bancoRepository.findByNombre(nombre);
		return lista;
	}
	
	@RequestMapping(value = "/obtener/bancos/sp", method = RequestMethod.GET)
	public @ResponseBody List<Banco> buscarBancosSP(){
		System.out.println("Obtener Bancos por SP");
		List<Banco> lista = bancoCustomRepository.obtenerBancosSP();
		
		return lista;
	}

	@RequestMapping(value = "/banco/buscar/nombre/sql", method = RequestMethod.GET)
	public @ResponseBody List<Banco> buscarXnombreBancoSQL(@RequestParam("nombre") String nombre) {
		
		System.out.println("Buscar Banco por Nombre SQL");
		
		List<Banco> lista = bancoRepository.buscarPorNombreSQL(nombre);
		return lista;
	}
	

	

	@RequestMapping(value = "/banco/ingresar", method = RequestMethod.POST)
	public boolean ingresarBanco(@RequestBody PeticionCrearBanco Request) {
		Banco banco = bancoRepository.save(Request.getBanco());

		// operador terciario
		return banco == null ? false : true;
	}

	@RequestMapping(value = "/banco/obtener/todos", method = RequestMethod.GET)
	public @ResponseBody ResponseConsultaBanco listaBanco() {
		// findAll regresa todos los registros que se encuentran en la tabla
		// El mapeo (casting) se pone del lado derecho entre ()
		List<Banco> lista = (List<Banco>) bancoRepository.findAll();

		ResponseConsultaBanco resp = new ResponseConsultaBanco();
		
		if (lista == null || lista.isEmpty()) {
			resp.setCodigo("01");
			resp.setCodigo_descripcion("No se encontraron resultados");
		} else {
			resp.setCodigo("00");
			resp.setCodigo_descripcion("Operacion correcta");
			resp.setLista(lista);
		}
		
		return resp;
	}
	
	@RequestMapping(value = "/banco/actualizar", method = RequestMethod.PATCH)
	public @ResponseBody boolean actualizarBanco(@RequestBody Banco banco){
		
		if(banco == null ) {
			return false;
		} else {
			if(banco.getIdBanco() <= 0 || banco.getNombre().isEmpty()) {
				return false;
			}
			else {
				if(bancoRepository.existsById((long)banco.getIdBanco())) {
					bancoRepository.save(banco);
					return true;
				} else {
					return false;
				}				
			}				
		}
	}
	
	/*
	 * CRUD Cuenta
	 * 
	 */
	
	@RequestMapping(value="/ingresar/tipo/movimiento", method = RequestMethod.POST)
	public boolean ingresarCuenta(@RequestBody TipoMovimiento tipo) {
		TipoMovimientoRepository.save(tipo);
		
		return true;
	}

	@RequestMapping(value = "/consulta/usuario", method = RequestMethod.POST)
	public RespuestaConsulta consultaUsuario(@RequestBody PeticionConsulta peticion) {
		System.out.println("Nombre:: " + peticion.getNombre());
		System.out.println("Nombre:: " + peticion.getOperacion());
		RespuestaConsulta resp = new RespuestaConsulta();
		resp.setCodigo("00");
		resp.setCodigo_descripcion("OK");
		resp.setId("100000");
		resp.setNombre("Fidelmar");
		resp.setApellido("Cruz");
		resp.setEdad(28);
		resp.setToken("Mitoken");
		return resp;
	}

	@RequestMapping(value = "/consulta/usuario/alternativo", method = RequestMethod.POST)
	public @ResponseBody RespuestaConsulta consultaUsuarioAlternativo(@RequestBody PeticionConsulta peticion) {
		System.out.println("Nombre:: " + peticion.getNombre());
		System.out.println("Nombre:: " + peticion.getOperacion());
		RespuestaConsulta resp = new RespuestaConsulta();
		resp.setCodigo("00");
		resp.setCodigo_descripcion("OK");
		resp.setId("100000");
		resp.setNombre("Fidelmar");
		resp.setApellido("Cruz");
		resp.setEdad(28);
		resp.setToken("Mitoken");
		return resp;
	}

	@RequestMapping(value = "/actualiza/usuario", method = RequestMethod.PUT)
	public RespuestaConsulta updateUsuario(@RequestBody PeticionConsulta peticion) {
		System.out.println("Nombre:: " + peticion.getNombre());
		System.out.println("Operacion:: " + peticion.getOperacion());

		RespuestaConsulta resp = new RespuestaConsulta();
		resp.setCodigo("00");
		resp.setCodigo_descripcion("OK");
		resp.setId("10001");
		resp.setNombre(peticion.getNombre());
		resp.setApellido("Cruz");
		resp.setEdad(28);
		resp.setToken(peticion.getToken());

		return resp;
	}

	@RequestMapping(value = "/elimina/usuario", method = RequestMethod.GET)
	public @ResponseBody boolean eliminarUsuario(@RequestParam("id") String idUsuario) {
		System.out.println("idUsuario:: " + idUsuario);
		return true;
	}

}
