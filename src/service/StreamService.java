package service;

import data.*;

import java.util.ArrayList;
import java.util.List;

//— Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
public class StreamService {

    public List<Stream> getSortedStreamByCountGroup(List<Stream> streamToSort){
        List<Stream> stream = new ArrayList<>(streamToSort);
        stream.sort(new StreamComparator());
        return stream;
    }
}
