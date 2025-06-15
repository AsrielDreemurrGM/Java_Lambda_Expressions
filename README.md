<h1>Java Lambda Expressions</h1>
<p>
  Java project containing practical and progressive examples of <strong>lambda expressions</strong>, 
  <strong>functional interfaces</strong>, and <strong>anonymous classes</strong>. 
  The goal is to demonstrate how lambdas simplify Java code and enable a more expressive and concise syntax.
</p>
<h2>📌 Contents</h2>
<ul>
  <li>Using <code>IntBinaryOperator</code> with lambdas and custom classes;</li>
  <li>Using <code>BiFunction</code> for typed operations (Integer, Double, Long);</li>
  <li>Comparing anonymous classes vs lambdas with a custom interface (<code>MyEventConsumer</code>);</li>
  <li>Working with <code>Runnable</code>, <code>Consumer</code>, and <code>Supplier</code> interfaces;</li>
  <li>Demonstrating thread creation with and without lambdas;</li>
  <li>Generic method to simplify output display in the console (<code>printToConsole()</code>);</li>
  <li>Descriptive inline comments and Javadocs for educational purposes.</li>
</ul>
<h2>🧠 Concepts Covered</h2>
<ul>
  <li>Java 8+ Lambda Expressions</li>
  <li>Functional Interfaces and Their Implementations</li>
  <li>Custom Functional Interfaces</li>
  <li>Anonymous Classes vs Lambda Syntax</li>
  <li>Functional Programming Techniques</li>
  <li>Thread Simplification Using Lambdas</li>
</ul>
<h2>🗂️ Project Structure</h2>
<ul>
  <li><code>br.com.eaugusto.lambdas</code>
    <ul>
      <li><code>LambdaTests</code> -> core lambda examples;</li>
      <li><code>IntBinaryOperatorClass</code> -> custom implementation of <code>IntBinaryOperator</code>;</li>
      <li><code>LambdaThreadsTests</code> -> thread creation with and without lambdas;</li>
    </ul>
  </li>
  <li><code>br.com.eaugusto.lambdas.anonymousclass</code>
    <ul>
      <li><code>AnonymousTests</code> -> usage of anonymous classes and lambdas with a custom interface;</li>
      <li><code>MyEventConsumer</code> -> a user-defined functional interface;</li>
    </ul>
  </li>
</ul>
<h2>🚀 How to Run</h2>
<ol>
  <li>Clone this repository;</li>
  <li>Open it using an IDE like Spring Tool Suite, Eclipse, or IntelliJ;</li>
  <li>Run the following main classes to see the examples:
    <ul>
      <li><code>LambdaTests.java</code></li>
      <li><code>LambdaThreadsTests.java</code></li>
      <li><code>AnonymousTests.java</code></li>
    </ul>
  </li>
</ol>
<h2>📅 Commit Highlights</h2>
<h3>June 14, 2025</h3>
<ul>
  <li>Created <code>AnonymousTests</code> to demonstrate anonymous classes vs lambda expressions using <code>MyEventConsumer</code>;</li>
  <li>Structured new package <code>lambdas.anonymousclass</code> and added Javadocs.</li>
</ul>
<h3>June 13, 2025</h3>
<ul>
  <li>Added <code>LambdaThreadsTests</code> showcasing three thread creation techniques: traditional, lambda with <code>Runnable</code>, and direct lambda in <code>Thread</code> constructor.</li>
  <li>Included examples using <code>Runnable</code>, <code>Consumer</code>, and <code>Supplier</code>.</li>
</ul>
<h3>June 12, 2025</h3>
<ul>
  <li>Introduced <code>BiFunction</code> examples using Integer, Double, and Long types, including a generic <code>calculate()</code> method;</li>
  <li>Improved readability with enhanced inline comments and a <code>printToConsole()</code> helper.</li>
</ul>
<h3>June 11, 2025</h3>
<ul>
  <li>Created <code>LambdaTests</code> demonstrating <code>IntBinaryOperator</code> using both lambda and custom class implementations.</li>
</ul>
<h2>🎯 Learning Goals</h2>
<ul>
  <li>Understand how lambdas improve code readability and conciseness in Java;</li>
  <li>Compare traditional implementations with functional programming alternatives;</li>
  <li>Develop a solid foundation with functional interfaces and lambda expressions;</li>
  <li>Learn how to create and use your own functional interfaces in real scenarios.</li>
</ul>
