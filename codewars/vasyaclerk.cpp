#include <iostream>
#include <string>
#include <vector>

std::string tickets(const std::vector<int> peopleInLine){
    unsigned long long cash = 0;
    for (int dollar: peopleInLine) {
        if (dollar == 25) 
            cash += dollar;
        else {
            if (dollar - 25 <= cash) cash += 25;
            else return "NO";
        }
    }
    return "YES";
}

int main(int argc, char* argv[]) {
    std::cout << tickets({25, 25, 50, 50}) << std::endl;
    std::cout << tickets({25, 25, 25, 25, 50, 100, 50}) << std::endl;
    std::cout << tickets({50, 50, 50, 50, 50, 50, 50, 50, 50, 50}) << std::endl;
    std::cout << tickets({100, 100, 100, 100, 100, 100, 100, 100, 100, 100}) << std::endl;
    std::cout << tickets({25, 25, 25, 25, 50, 100, 50}) << std::endl;
    std::cout << tickets({50, 100, 100}) << std::endl;
    std::cout << tickets({25, 50, 100, 25, 25, 25, 50}) << std::endl;
    std::cout << tickets({25, 50, 25, 50, 100, 25, 25, 50}) << std::endl;
    std::cout << tickets({25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 100, 100, 100, 100}) << std::endl;
    std::cout << tickets({25, 25, 25, 25, 25, 100, 100}) << std::endl;
    return 0;
}