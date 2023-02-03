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

    public static void main(String Args[]) {
        Cliente cliente = new Cliente();
        cliente.setName("wilson");
        cliente.setAddress("rua 1");

        System.out.println(cliente.getName());
        System.out.println(cliente.getAddress());

    }

    public void cadastrarAddress(String Address[]) {
        setAddress(Arrays.toString(Address));


    }

}
