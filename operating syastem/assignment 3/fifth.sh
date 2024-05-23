echo "enter the numbers "
read a
read b
read c

if [ $a -gt $b ] && [ $a -gt $c ]
then 
	echo $a
elif [ $b -gt $a ] && [ $b -gt $c ]
then
	echo $b
elif [ $c -gt $a ] && [ $c -gt $b ]
then
	echo $c
fi
