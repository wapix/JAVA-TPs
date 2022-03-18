package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository ;

    public ClientServiceImpl(ClientRepository clientRepository) {
        System.out.println("Call ClientServiceImpl with ClientRepository ....");
        this.clientRepository = clientRepository;
    }


    public ClientServiceImpl() {
        System.out.println("Call ClientServiceImpl ....");
    }

    @Override
    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        clientRepository.save(c);
        return c;
    }

    @Override
    public Client modify(Client c) {
        return clientRepository.update(c);
    }

    @Override
    public void removeById(long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client getById(long id) {
        return clientRepository.findById(id);
    }


}
