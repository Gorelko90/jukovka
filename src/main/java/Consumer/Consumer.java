package Consumer;

import java.util.Objects;

public class Consumer {

    private int idConsumer;
    private String fullNameConsummer;
    private String addressConsummer;


    public Consumer(int idConsumer, String name, String address) {
        this.idConsumer = idConsumer;
        this.fullNameConsummer = name;
        this.addressConsummer = address;
    }

    public int getIdConsumer() {

        return idConsumer;
    }

    public void setIdConsumer(int idConsumer) {

        this.idConsumer = idConsumer;
    }

    public String getName() {
        return fullNameConsummer;
    }

    public String getAddress() {

        return addressConsummer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Consumer)) return false;
        Consumer consumer = (Consumer) o;
        return getIdConsumer() == consumer.getIdConsumer() && Objects.equals(fullNameConsummer, consumer.fullNameConsummer) && Objects.equals(addressConsummer, consumer.addressConsummer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(getIdConsumer(), fullNameConsummer, addressConsummer);
    }

    @Override
    public String toString() {
        return "Consumer{" + "idConsumer=" + idConsumer + ", name='" + fullNameConsummer + '\'' + ", address='" + addressConsummer + '\'' + '}';
    }
}
