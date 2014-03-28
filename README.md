komp14-testsuite
================

Test suite for mini java compiler

##Installation guide

Best way to use this test suite is to add it as git submodule to your own project

Add the submodule

````
$ git submodule add https://github.com/Wneh/komp14-testsuite.git
````

Now, download the submodules files

````
$ git submodule init
````
````
$ git submodule update
````

And you're done, the komp14-testsuite folder should be filled with content

##Run the test script from ant

If you're using ant build system add the following lines to call the test script from ant

````
<target name="test">
	<exec executable="/bin/sh">
		<arg value="./komp14-testsuite/run.sh"/>
	</exec>
</target>
````

You should now be able to run the test suite by typing

````
ant test
````
