#include <iostream>

unsigned int countBits(unsigned long long n){
    unsigned int result = 0;
    if (n / 2 != 0) {
        result += countBits(n / 2);
    }
    result += n % 2;
    return result;
}

int main(int argc, char* argv[]) {
    std::cout << countBits(26) << std::endl;
    std::cout << countBits(7) << std::endl;
    std::cout << countBits(0) << std::endl;
    std::cout << countBits(3811) << std::endl;
    return 0;
}