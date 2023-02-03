package Clients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@NoArgsConstructor
@Getter
@Setter
public class Cliente {

    private Long id;
    private String name;
    private String address;

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setName("Wilson");
        cliente.setAddress("Rua Marcos E. Bovo");
        
        cliente.setId(1L);
        System.out.println(cliente.getId());
        System.out.println(cliente.getName());
        System.out.println(cliente.getAddress());



    }

    public void cadastrarAddress(String[] address) {
        setAddress("Address");


    }

}
