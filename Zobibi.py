import random

def generate_city(region):
    if region == "Kara":
        citys = ["Kara", "Bassar", "Sokodé", "Mango", "Dapaong"]
    elif region == "Maritime":
        citys = ["Lomé", "Aneho", "Tabligbo", "Tsevie", "Kpalimé"]
    else:
        return None # if the region is not known, we return None
    return random.choice(citys)

Game = input("Enter game type: ")
region1 = input("Region 1 : ")
region2 = input("Region 2 : ")

city1 = generate_city(region1)
city2 = generate_city(region2)

print("Generating Playoff City 1 : " + city1)
print("Generating Playoff City 2 : " + city2)
