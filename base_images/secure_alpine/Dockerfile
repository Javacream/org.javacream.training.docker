#FROM alpine
FROM alpine@sha256:d6d0a0eb4d40ef96f2310ead734848b9c819bb97c9d846385c4aca1767186cd4

ENV USER=docker
ENV UID=12345
ENV GID=23456

RUN addgroup "$USER"
RUN adduser \
    --disabled-password \
    --gecos "" \
    --home "$(pwd)" \
    --ingroup "$USER" \
    --no-create-home \
    --uid "$UID" \
    "$USER"
USER "$USER"
