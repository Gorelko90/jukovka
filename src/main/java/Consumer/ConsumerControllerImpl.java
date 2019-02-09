package Consumer;

import java.util.HashMap;
import java.util.Map;

public class ConsumerControllerImpl implements ConsumerController {

    private Map<Integer, Consumer> mapConsumer = new HashMap<Integer, Consumer>();


    public void createConsumer(Consumer consumer) {


        int maxKeyID = 0; // это переменная в которую будет ложится максимальный ID, мне нужнно его знать, чтобы потом его увеличить на 1
        for (int key: mapConsumer.keySet()) {  // Перебираем мапу с покупателями
            if(maxKeyID <= key) {

                maxKeyID = key;  //определяем его ID номер

            }

        }

        consumer.setIdConsumer(maxKeyID+1); //Присваиваем ID номер покупателю +1
        mapConsumer.put((maxKeyID+1), consumer); //Вставляем покупателя с его ID+1, в мапу
    }


    public void getListConsumer() {

        for (Map.Entry entry : mapConsumer.entrySet()) {
            System.out.println("ID: "+entry.getKey() + ", " + entry.getValue());
        }
        System.out.println();

    }

}
