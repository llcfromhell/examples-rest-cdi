package io.github.llcfromhell.examples.rest.cdi.jobs;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class Agendador {
	

	@Schedule(hour = "*", minute = "*", second = "*/50", persistent = false)
	void agendado() {
		System.out.println("[INFO] Verificando servi�o externo periodicamente.");
	}

}
