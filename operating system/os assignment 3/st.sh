echo "Enter a String"
read String

len=`echo -n $String | wc -c`
if [ $len -lt 10 ] 
    then
    echo "String is less then 10"
fi
