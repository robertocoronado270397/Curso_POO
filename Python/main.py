from car import Car

if __name__ == "__main__":
    car = Car()
    car.license = "Am"
    car.driver = "Julio"
    print(vars(car))

    car2 = Car()
    car2.license = "Qkjdsnfoie"
    car2.driver = "kjnewdfojkwnf"
    print(vars(car2))