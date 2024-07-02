import matplotlib.pyplot as plt

import matplotlib.pyplot as plt

# Datos de todos los tests
longitudes = list(range(1, 16))

tests = {
    "Test 1": [
        411500, 33875, 70959, 213000, 635916, 1098792, 
        1017917, 1727042, 3492792, 10247959, 22766084, 
        46717667, 154361584, 417912666, 1145176375
    ],
    "Test 2": [
        365375, 28083, 67541, 221542, 511875, 929666, 
        1084541, 1751500, 4226875, 10901083, 22085875, 
        44548500, 137908667, 413469625, 1196775250
    ],
    "Test 3": [
        368042, 29208, 69250, 199959, 749500, 899958, 
        873084, 1534583, 3491208, 10318292, 21458709, 
        44871833, 153944459, 366020458, 1231957750
    ],
    "Test 4": [
        391000, 29625, 72000, 216500, 672458, 1171459, 
        1005458, 1861417, 2531583, 6494958, 20191916, 
        41858375, 144029167, 308619333, 1268827042
    ],
    "Test 5": [
        493084, 30500, 81042, 207625, 575250, 937250, 
        857042, 1564125, 2894083, 6504666, 21446917, 
        41762750, 128716583, 390803167, 1343116459
    ]
}

for test_name, tiempos in tests.items():
    plt.figure(figsize=(8, 5))
    plt.plot(longitudes, tiempos, marker='o', linestyle='-', color='b')
    plt.title(f'Tiempos para descubirPalabrasDeLaHumanidad - {test_name}')
    plt.xlabel('Longitud de las palabras')
    plt.ylabel('Tiempo (nanosegundos)')
    plt.grid(True)
    plt.tight_layout()
    plt.show()

# Graficar todos los tests juntos
plt.figure(figsize=(10, 6))
markers = ['o', 's', '^', 'd', 'x']
colors = ['b', 'g', 'r', 'c', 'm']

for idx, (test_name, tiempos) in enumerate(tests.items()):
    plt.plot(longitudes, tiempos, marker=markers[idx], linestyle='-', color=colors[idx], label=test_name)

plt.title('Tiempos para descubirPalabrasDeLaHumanidad')
plt.xlabel('Longitud de las palabras')
plt.ylabel('Tiempo (nanosegundos)')
plt.legend()
plt.grid(True)
plt.tight_layout()
plt.show()


# Crear el gráfico combinado
plt.figure(figsize=(10, 6))
