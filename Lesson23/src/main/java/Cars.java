import java.util.ArrayList;
import java.util.List;


public class Cars {

    private static final List<CarConstr> carList = new ArrayList<>();

    static {
        carList.add(new CarConstr("1", "Audi", "1996", "Germany"));
        carList.add(new CarConstr("2", "Bugatti", "2011", "France"));
        carList.add(new CarConstr("3", "Chevrolet", "2016", "America"));
        carList.add(new CarConstr("4", "Hyundai", "2006", "South Korea"));
        carList.add(new CarConstr("5", "Nissan", "2008", "Japan"));
    }

    public CarConstr getCarWithId(String id) {
        for (CarConstr key : carList) {
            if (key.getId().equals(id)) {
                return key;
            }
        }
        return null;
    }

    public CarConstr save(CarConstr car) {
        carList.add(car);
        return car;
    }

    public void delete(String id) {
        CarConstr del = getCarWithId(id);
        carList.remove(del);
    }

    public List<CarConstr> allCars(){
        return carList;
    }
}
