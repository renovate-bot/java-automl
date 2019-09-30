/*
 * Copyright 2019 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/translation.proto

package com.google.cloud.automl.v1beta1;

public interface TranslationAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TranslationAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only . The translated content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
   */
  boolean hasTranslatedContent();
  /**
   *
   *
   * <pre>
   * Output only . The translated content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
   */
  com.google.cloud.automl.v1beta1.TextSnippet getTranslatedContent();
  /**
   *
   *
   * <pre>
   * Output only . The translated content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
   */
  com.google.cloud.automl.v1beta1.TextSnippetOrBuilder getTranslatedContentOrBuilder();
}
