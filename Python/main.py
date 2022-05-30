import imp
from car import Car

if __name__=="__main__":
    print("Hola mundo")
    
    car = Car()
    car.license = "ABC-123"
    car.driver = "Juan"
    car.passengers = 4
    print(vars(car))
    
    car2 = Car()
    car2.license = "DEF-456"
    car2.driver = "Pedro"
    car2.passengers = 2
    print(vars(car2))