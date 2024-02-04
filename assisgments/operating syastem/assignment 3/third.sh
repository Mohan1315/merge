read -p "Enter the value of a : " a
read -p "Enter the value of b : " b
read -p "Enter the value of c : " c

d=$((a+b+c))
e=$(((a-b)*c))
f=$(((a*b)/c))
echo "a + b + c : $d"
echo "(a - b) * c : $e"
echo "(a * b) / c : $f"
