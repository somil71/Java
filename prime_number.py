HEAD
n = int(input("Enter a number: "))
is_prime = True

if n <= 1:
    is_prime = False
else:
    for i in range(2, n // 2 + 1):
        if n % i == 0:
            is_prime = False
            break

if is_prime:
    print(f"{n} is a prime number.")
else:
    print(f"{n} is not a prime number.")                                                                                                                                                              
n = int(input("Enter a number: "))
is_prime = True

if n <= 1:
    is_prime = False
else:
    for i in range(2, n // 2 + 1):
        if n % i == 0:
            is_prime = False
            break

if is_prime:
    print(f"{n} is a prime number.")
else:
    print(f"{n} is not a prime number.")
