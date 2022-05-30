from account import Account

class Car:
    id = int
    license = str
    driver = Account("","")
    passengers = int
    
    def __init__(self,license,driver) -> None:
        self.license = license
        self.driver = driver
        
    def printDataCar(self):
        print("Driver: {}".format(self.driver.name))
        print("License: {}".format(self.driver.license))
        print("Passengers: {}".format(self.passengers))