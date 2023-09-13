package br.com.fatecdiadema.service;

import org.springframework.stereotype.Service;
import br.com.fatecdiadema.model.Cliente;
import br.com.fatecdiadema.repository.MeuRepositoy;

@Service
public class MeuService {
    // Logica e plano de negocio vai aqui

    private MeuRepositoy repositoy;

    public MeuService(MeuRepositoy repositoy){
        this.repositoy = repositoy;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repositoy.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplicar validação
    }
}