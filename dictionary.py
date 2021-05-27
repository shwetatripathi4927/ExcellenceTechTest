obj={4:'abc', 10:'ab2', 5:'abc3', 6:'abc5'}
newObj={}
for i in sorted(obj):
    newObj[i]=obj[i]
print(newObj)