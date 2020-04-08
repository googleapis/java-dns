/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.dns.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dns.v1.stub.ProjectStub;
import com.google.cloud.dns.v1.stub.ProjectStubSettings;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Configures and serves authoritative DNS records.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (ProjectClient projectClient = ProjectClient.create()) {
 *   ProjectName project = ProjectName.of("[PROJECT]");
 *   Project response = projectClient.getProject(project);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the projectClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of ProjectSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * ProjectSettings projectSettings =
 *     ProjectSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ProjectClient projectClient =
 *     ProjectClient.create(projectSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ProjectSettings projectSettings =
 *     ProjectSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ProjectClient projectClient =
 *     ProjectClient.create(projectSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ProjectClient implements BackgroundResource {
  private final ProjectSettings settings;
  private final ProjectStub stub;

  /** Constructs an instance of ProjectClient with default settings. */
  public static final ProjectClient create() throws IOException {
    return create(ProjectSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ProjectClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ProjectClient create(ProjectSettings settings) throws IOException {
    return new ProjectClient(settings);
  }

  /**
   * Constructs an instance of ProjectClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use ProjectSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ProjectClient create(ProjectStub stub) {
    return new ProjectClient(stub);
  }

  /**
   * Constructs an instance of ProjectClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected ProjectClient(ProjectSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ProjectStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ProjectClient(ProjectStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ProjectSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ProjectStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   Project response = projectClient.getProject(project);
   * }
   * </code></pre>
   *
   * @param project Identifies the project addressed by this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Project getProject(ProjectName project) {
    GetProjectHttpRequest request =
        GetProjectHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .build();
    return getProject(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   Project response = projectClient.getProject(project.toString());
   * }
   * </code></pre>
   *
   * @param project Identifies the project addressed by this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Project getProject(String project) {
    GetProjectHttpRequest request = GetProjectHttpRequest.newBuilder().setProject(project).build();
    return getProject(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   GetProjectHttpRequest request = GetProjectHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   Project response = projectClient.getProject(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Project getProject(GetProjectHttpRequest request) {
    return getProjectCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   GetProjectHttpRequest request = GetProjectHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;Project&gt; future = projectClient.getProjectCallable().futureCall(request);
   *   // Do something
   *   Project response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetProjectHttpRequest, Project> getProjectCallable() {
    return stub.getProjectCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
