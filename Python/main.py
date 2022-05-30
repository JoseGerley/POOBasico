import imp
from car import Car
from account import Account

if __name__=="__main__":
    print("Hola mundo")
    
    car = Car("ABC-123", Account("Juan", "123.456.789-0"))
    car.passengers = 4
    print(vars(car))
    print(vars(car.driver))