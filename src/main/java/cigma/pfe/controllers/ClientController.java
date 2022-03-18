package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import cigma.pfe.services.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("ctrl1")
public class ClientController {

    @Autowired
    ClientService clientService;

    public ClientController(ClientService clientService) {
        System.out.println("Call ClientController with clientService param....");
        this.clientService = clientService;
    }

    public ClientController() {
        System.out.println("Call ClientController ....");
    }


    public Client save(Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }

    public void modify(Client c){
        clientService.modify(c);
    }
    public void removeById(long id){
        clientService.removeById(id);
    }
    public Client getById(long id){
        return clientService.getById(id);
    }




}
