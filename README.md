# ScalaJS Mousetrap Facade

This is a [ScalaJS][scalajs] facade for [Mousetrap][mousetrap].

## Installing

**Step 1.** Add [JitPack][jitpack] to your repositories in [SBT][sbt]:

```scala
resolvers += "jitpack" at "https://jitpack.io"
```

**Step 2.** Add this repo as a dependency:

```scala
libraryDependencies += "blog.codeninja" % "scala-js-mosuetrap" % "1.6.1"
```

If you'd like the latest-and-greatest version, use "master-SNAPSHOT".

## Example Usage

Perform a simple HTTP get, wait for it, and print the response.

```scala
import scala.scalajs.js
import blog.codeninja.scalajs.mousetrap._

object Example {
    def main(args: Array[String]) = {
        Mousetrap.bind("space", (e: Event) => println("Hello, world!"), js.undefined)
    }
}
```

The entire [Mousetrap][mousetrap] is implemented and type safe. Additionally, a few extra case classes are implemented for some constant strings.

## That's It

If you find a bug or have suggestions on how to improve the facade (specifically adding some more type safety where possible), please open an issue and tell me about it.

Hope you find this helpful!

[scalajs]:      http://www.scala-js.org
[sbt]:          http://www.scala-sbt.org
[mousetrap]:    https://craig.is/killing/mice
[jitpack]:      https://jitpack.io
