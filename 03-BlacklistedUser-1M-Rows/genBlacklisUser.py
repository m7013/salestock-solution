import random
import string

blckListPopul = 1000000
blckListPopulStart = 1000000
blckListPopulEnd = 2000000

def id_generator(size=6, chars=string.ascii_uppercase + string.digits):
	return ''.join(random.choice(chars) for _ in range(size))

for x in xrange(blckListPopul):
    blckListPopulStart += 1
    blckListPopulEnd -=1
    name = ""
    phonenum = 0
    if x % 2 == 0:
    	phonenum =  blckListPopulStart
    else:
    	phonenum = blckListPopulEnd
    name = id_generator()

    print name + " " + str(phonenum)
