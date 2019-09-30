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
// source: google/cloud/automl/v1beta1/data_items.proto

package com.google.cloud.automl.v1beta1;

public interface DocumentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.Document)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An input config specifying the content of the document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
   */
  boolean hasInputConfig();
  /**
   *
   *
   * <pre>
   * An input config specifying the content of the document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
   */
  com.google.cloud.automl.v1beta1.DocumentInputConfig getInputConfig();
  /**
   *
   *
   * <pre>
   * An input config specifying the content of the document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
   */
  com.google.cloud.automl.v1beta1.DocumentInputConfigOrBuilder getInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The plain text version of this document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet document_text = 2;</code>
   */
  boolean hasDocumentText();
  /**
   *
   *
   * <pre>
   * The plain text version of this document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet document_text = 2;</code>
   */
  com.google.cloud.automl.v1beta1.TextSnippet getDocumentText();
  /**
   *
   *
   * <pre>
   * The plain text version of this document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet document_text = 2;</code>
   */
  com.google.cloud.automl.v1beta1.TextSnippetOrBuilder getDocumentTextOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes the layout of the document.
   * Sorted by [page_number][].
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Document.Layout layout = 3;</code>
   */
  java.util.List<com.google.cloud.automl.v1beta1.Document.Layout> getLayoutList();
  /**
   *
   *
   * <pre>
   * Describes the layout of the document.
   * Sorted by [page_number][].
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Document.Layout layout = 3;</code>
   */
  com.google.cloud.automl.v1beta1.Document.Layout getLayout(int index);
  /**
   *
   *
   * <pre>
   * Describes the layout of the document.
   * Sorted by [page_number][].
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Document.Layout layout = 3;</code>
   */
  int getLayoutCount();
  /**
   *
   *
   * <pre>
   * Describes the layout of the document.
   * Sorted by [page_number][].
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Document.Layout layout = 3;</code>
   */
  java.util.List<? extends com.google.cloud.automl.v1beta1.Document.LayoutOrBuilder>
      getLayoutOrBuilderList();
  /**
   *
   *
   * <pre>
   * Describes the layout of the document.
   * Sorted by [page_number][].
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Document.Layout layout = 3;</code>
   */
  com.google.cloud.automl.v1beta1.Document.LayoutOrBuilder getLayoutOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The dimensions of the page in the document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DocumentDimensions document_dimensions = 4;</code>
   */
  boolean hasDocumentDimensions();
  /**
   *
   *
   * <pre>
   * The dimensions of the page in the document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DocumentDimensions document_dimensions = 4;</code>
   */
  com.google.cloud.automl.v1beta1.DocumentDimensions getDocumentDimensions();
  /**
   *
   *
   * <pre>
   * The dimensions of the page in the document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DocumentDimensions document_dimensions = 4;</code>
   */
  com.google.cloud.automl.v1beta1.DocumentDimensionsOrBuilder getDocumentDimensionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Number of pages in the document.
   * </pre>
   *
   * <code>int32 page_count = 5;</code>
   */
  int getPageCount();
}
